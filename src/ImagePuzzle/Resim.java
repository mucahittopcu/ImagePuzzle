package ImagePuzzle;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.imageio.ImageIO;

public class Resim {

    BufferedImage gorsel;

    Color c1;
    Color c2;
    //BufferedImage aad = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
    BufferedImage[] resimDizisi = new BufferedImage[16];
    BufferedImage[] resimDizisi2 = new BufferedImage[16];
    int xDegeri;
    int yDegeri;
    int yeniResimGenislik;
    int yeniResimYukseklik;

    public Resim() {

    }

    public BufferedImage getGorsel() {
        return gorsel;
    }

    public void setGorsel(BufferedImage gorsel) {
        this.gorsel = gorsel;
    }

    public BufferedImage[] getResimDizisi() {
        return resimDizisi;
    }

    public void setResimDizisi(BufferedImage[] resimDizisi) {
        this.resimDizisi = resimDizisi;
    }

    public void resimYukle() {
        try {
            gorsel = ImageIO.read(new File("pp_2.jpg"));
            gorsel = createResizedCopy(gorsel, 400, 400, true);

            System.out.println("Resim boyut X: " + gorsel.getWidth());
            System.out.println("Resim boyut Y: " + gorsel.getHeight());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void shuffleArray(BufferedImage[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        BufferedImage a = new BufferedImage(yeniResimGenislik, yeniResimYukseklik, BufferedImage.TYPE_INT_RGB);;
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(15);
            // Simple swap
            a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        //return ar;
    }

    public void resimParcala() {
        yeniResimGenislik = gorsel.getWidth() / 4;
        yeniResimYukseklik = gorsel.getHeight() / 4;
        int sayac = 0;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                resimDizisi[sayac] = new BufferedImage(yeniResimGenislik, yeniResimYukseklik, BufferedImage.TYPE_INT_RGB);
                Graphics2D gr = resimDizisi[sayac++].createGraphics();
                gr.drawImage(gorsel, 0, 0, yeniResimGenislik, yeniResimYukseklik, yeniResimGenislik
                        * y, yeniResimYukseklik * x, yeniResimGenislik * y + yeniResimGenislik,
                        yeniResimYukseklik * x + yeniResimYukseklik, null);
                gr.dispose();

            }
        }
        System.out.println("Resim parcalandi");
    }

    public void resimParcala2() {
        int sayac = 0;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                resimDizisi2[sayac] = new BufferedImage(yeniResimGenislik, yeniResimYukseklik, BufferedImage.TYPE_INT_RGB);
                Graphics2D gr = resimDizisi2[sayac++].createGraphics();
                gr.drawImage(gorsel, 0, 0, yeniResimGenislik, yeniResimYukseklik, yeniResimGenislik
                        * y, yeniResimYukseklik * x, yeniResimGenislik * y + yeniResimGenislik,
                        yeniResimYukseklik * x + yeniResimYukseklik, null);
                gr.dispose();

            }
        }
        System.out.println("Resim parcalandi2");
    }

    public boolean resimToRGBlerEsitMi(BufferedImage bi1, BufferedImage bi2) {
        boolean cikis = false;
        for (int i = 0; i < yeniResimGenislik; i++) {
            for (int j = 0; j < yeniResimYukseklik; j++) {
                c1 = new Color(bi1.getRGB(i, j));
                c2 = new Color(bi2.getRGB(i, j));
                //System.out.println(c1.getBlue()+"-"+c2.getBlue()+"  ---  "+c1.getGreen()+"-"+c2.getGreen());
                if (c1.getBlue() != c2.getBlue() || c1.getGreen() != c2.getGreen() || c1.getRed() != c2.getRed()) {
                    cikis = true;

                    break;
                }

            }
            if (cikis == true) {

                break;
            }
        }

        if (cikis == true) {

            return false;
        } else {
            return true;
        }

    }

    BufferedImage createResizedCopy(Image originalImage,int scaledWidth, int scaledHeight,boolean preserveAlpha) {
        
        System.out.println("resizing...");
        int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
        Graphics2D g = scaledBI.createGraphics();
        if (preserveAlpha) {
            g.setComposite(AlphaComposite.Src);
        }
        g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
        g.dispose();
        return scaledBI;
    }
}
