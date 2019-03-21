package ImagePuzzle;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JFrame1 extends javax.swing.JFrame {

	public static int puan = 100;
	public JButton[] butonDizisi = new JButton[16];
	public boolean[] KapaliButon = new boolean[16];
	int swapTutulan;
	boolean seciliMi = false;

	BufferedImage tutulanResim;
	Resim resim = new Resim();
	BufferedImage[] KarismisResimDizisi = new BufferedImage[16];

	public JFrame1() {
		initComponents();
		frameOzellikleri();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("ImagePuzzle");
		setResizable(false);

		jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton3.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton4.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton5.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton6.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton7.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton8.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton9.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton10.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton11.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton12.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton13.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton14.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton15.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton16.setPreferredSize(new java.awt.Dimension(100, 100));
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(55, 55, 55)));

		jButton17.setText("KARIŞTIR");
		jButton17.setPreferredSize(new java.awt.Dimension(400, 400));
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel1.setText("                Puanım :");

		jLabel2.setText("100");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setText("EN YÜKSEK SKOR: ");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setText("0");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2).addGap(36, 36, 36))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3).addComponent(jLabel4))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
						.addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(19, 19, 19)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed
		
		butonKapatmaDizisi();
		puan = 100;
		jLabel2.setText("100");
		boolean ortakGeldiMi = false;
		boolean esitlikBozulduMu = false;
		System.out.println("karıştıra basıldı");

		// FOTOGRAFLARI KARIŞTIR
		resim.shuffleArray(resim.resimDizisi);
		ekranaBas();

		// RGB KONTROLÜ
		for (int i = 0; i < 16; i++) {
			boolean cevap = resim.resimToRGBlerEsitMi(resim.resimDizisi[i], resim.resimDizisi2[i]);
			if (cevap == true) {
				System.out.println("resim eşit");
				KapaliButon[i]=false;
				ortakGeldiMi = true;
			} else {
				System.out.println("eşitdeğil");
				esitlikBozulduMu = true;
			}

		}
		if (ortakGeldiMi == false) {
			butonDevreDisi();
		} else {
			butonEtkin();
		}

		if (esitlikBozulduMu == false) {
			puan = 100;
			System.out.println("OYUN BİTTİ");
			Object[] options = { "Tekrar Oyna", "hayır,çıkış" };
			int n = JOptionPane.showOptionDialog(null, "Puanınız: " + puan + ". Tekrar oynamak ister misiniz?",
					"Tebrikler...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (n == JOptionPane.YES_OPTION) {
				frameOzellikleri();
				jLabel2.setText("100");
				dosyaYaz(puan);
				puan = 100;
			} else if (n == JOptionPane.NO_OPTION) {
				dosyaYaz(puan);
				System.exit(0);
			}
		}

		System.out.println("karıştırıldı");
	}// GEN-LAST:event_jButton17ActionPerformed

	public void yerDegistirmeIslemi(int butonId) {

		if (KapaliButon[butonId] == true) {
			boolean deger1 = false, deger2 = false;
			if (seciliMi == true && swapTutulan == butonId) {
				butonDizisi[butonId].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
				seciliMi = false;

			} else if (seciliMi == true && swapTutulan != butonId) {

				System.out.println("seçili durumu:" + seciliMi);
				BufferedImage bir = resim.resimDizisi[butonId];

				deger1 = resim.resimToRGBlerEsitMi(resim.resimDizisi2[swapTutulan], bir);
				deger2 = resim.resimToRGBlerEsitMi(resim.resimDizisi2[butonId], tutulanResim);

				if (deger1 == false && deger2 == false) {
					puan = puan - 3;
					String a = Integer.toString(puan);
					jLabel2.setText(a);
				} else if ((deger1 == true && deger2 == false) || (deger1 == false && deger2 == true)) {
					puan = puan - 2;
					String a = Integer.toString(puan);
					jLabel2.setText(a);
					if (deger1 == true) {
						KapaliButon[swapTutulan] = false;
					} else if (deger2 == true) {
						KapaliButon[butonId] = false;
					}
				} else if (deger1 == true && deger2 == true) {
					puan--;
					KapaliButon[swapTutulan] = false;
					KapaliButon[butonId] = false;
					String a = Integer.toString(puan);
					jLabel2.setText(a);
				}

				resim.resimDizisi[butonId] = tutulanResim;
				resim.resimDizisi[swapTutulan] = bir;
				seciliMi = false;
				ekranaBas();

				// OYUN BİTTİ Mİ KONTROLÜ
				boolean x = false;
				for (int i = 0; i < 16; i++) {
					boolean cevap = resim.resimToRGBlerEsitMi(resim.resimDizisi[i], resim.resimDizisi2[i]);
					if (cevap == true) {
						// System.out.println("resim eşit");

					} else {
						// System.out.println("eşitdeğil");
						x = true;
					}

				}
				if (x == false) {
					System.out.println("OYUN BİTTİ");
					Object[] options = { "Tekrar Oyna", "hayır,çıkış" };
					int n = JOptionPane.showOptionDialog(null, "Puanınız: " + puan + ". Tekrar oynamak ister misiniz?",
							"Tebrikler...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
							options[0]);
					if (n == JOptionPane.YES_OPTION) {

						dosyaYaz(puan);
						frameOzellikleri();
						jLabel2.setText("100");
						puan = 100;

					} else if (n == JOptionPane.NO_OPTION) {
						dosyaYaz(puan);
						System.exit(0);
					}
				}

				System.out.println("PUAN: " + puan);
				butonDizisi[swapTutulan]
						.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

			} else {
				// jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new
				// java.awt.Color(222, 37, 37)));
				butonDizisi[butonId]
						.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 37, 37), 5));
				System.out.println("seçili durumu:" + seciliMi);
				tutulanResim = resim.resimDizisi[butonId];
				swapTutulan = butonId;
				seciliMi = true;
			}

		}
	}

	public void dosyaYaz(int gelenPuan) {
		String a = Integer.toString(gelenPuan);
		FileWriter fileWriter = null;
		try {

			File file = new File("dosya.txt");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException ex) {
					Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			fileWriter = new FileWriter(file, true);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write(a + "\n");
			bWriter.close();
		} catch (IOException ex) {
			Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fileWriter.close();
			} catch (IOException ex) {
				Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public ArrayList<Integer> dosyaOku() {

		ArrayList<Integer> dizi = new ArrayList<Integer>();
		try {

			File file = new File("dosya.txt");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException ex) {
					Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			FileReader fileReader = new FileReader(file);
			String line;

			BufferedReader br = new BufferedReader(fileReader);

			while ((line = br.readLine()) != null) {

				System.out.println(line);
				int b = Integer.parseInt(line);
				dizi.add(b);

			}

			br.close();
		} catch (IOException ex) {
			Logger.getLogger(JFrame1.class.getName()).log(Level.SEVERE, null, ex);
		}
		return dizi;
	}

	public int bubblesort(Integer[] A) // bir diziyi parametre alan fonksiyon
	{

		int tmp;

		for (int i = 0; i < A.length; i++) {
			// for(int j=1; j<A.length-i+1; j++) şeklinde de döngü yazılabilir
			for (int j = A.length - 1; j > i; j--) // i'ye kadar olan kısmı sabitlendiği için tekrar geçişlerde kontrolü
													// gerekmemektedir.
			{
				if (A[j - 1] > A[j]) {
					tmp = A[j - 1];
					A[j - 1] = A[j];
					A[j] = tmp;
				}
			}
		}
		return A[A.length - 1];
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		
		yerDegistirmeIslemi(0);
		

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

		yerDegistirmeIslemi(1);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		yerDegistirmeIslemi(2);
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		yerDegistirmeIslemi(3);
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		yerDegistirmeIslemi(4);
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(5);
	}// GEN-LAST:event_jButton6ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(6);
	}// GEN-LAST:event_jButton7ActionPerformed

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(7);
	}// GEN-LAST:event_jButton8ActionPerformed

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(8);
	}// GEN-LAST:event_jButton9ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(9);
	}// GEN-LAST:event_jButton10ActionPerformed

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(10);
	}// GEN-LAST:event_jButton11ActionPerformed

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(11);
	}// GEN-LAST:event_jButton12ActionPerformed

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(12);
	}// GEN-LAST:event_jButton13ActionPerformed

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(13);
	}// GEN-LAST:event_jButton14ActionPerformed

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(14);
	}// GEN-LAST:event_jButton15ActionPerformed

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
		// TODO add your handling code here:
		yerDegistirmeIslemi(15);
	}// GEN-LAST:event_jButton16ActionPerformed

	public void ekranaBas() {
		Icon uy1 = new ImageIcon(resim.resimDizisi[0], null);
		jButton1.setIcon(uy1);
		jButton1.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[1], null);
		jButton2.setIcon(uy1);
		jButton2.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[2], null);
		jButton3.setIcon(uy1);
		jButton3.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[3], null);
		jButton4.setIcon(uy1);
		jButton4.setText(null);

		uy1 = new ImageIcon(resim.resimDizisi[4], null);
		jButton5.setIcon(uy1);
		jButton5.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[5], null);
		jButton6.setIcon(uy1);
		jButton6.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[6], null);
		jButton7.setIcon(uy1);
		jButton7.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[7], null);
		jButton8.setIcon(uy1);
		jButton8.setText(null);

		uy1 = new ImageIcon(resim.resimDizisi[8], null);
		jButton9.setIcon(uy1);
		jButton9.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[9], null);
		jButton10.setIcon(uy1);
		jButton10.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[10], null);
		jButton11.setIcon(uy1);
		jButton11.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[11], null);
		jButton12.setIcon(uy1);
		jButton12.setText(null);

		uy1 = new ImageIcon(resim.resimDizisi[12], null);
		jButton13.setIcon(uy1);
		jButton13.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[13], null);
		jButton14.setIcon(uy1);
		jButton14.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[14], null);
		jButton15.setIcon(uy1);
		jButton15.setText(null);
		uy1 = new ImageIcon(resim.resimDizisi[15], null);
		jButton16.setIcon(uy1);
		jButton16.setText(null);
	}

	public void frameOzellikleri() {
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		resim.resimYukle();
		resim.resimParcala();
		resim.resimParcala2();
		butonDevreDisi();
		butonDizisineAt();
		butonKapatmaDizisi();
		ArrayList<Integer> dizi = dosyaOku();
		Integer[] arr = new Integer[dizi.size()];
		arr = dizi.toArray(arr);
		int enBuyuk = bubblesort(arr);
		String en = Integer.toString(enBuyuk);
		jLabel4.setText(en);

	}

	public void butonKapatmaDizisi() {
		for (int i = 0; i < KapaliButon.length; i++) {
			KapaliButon[i] = true;
		}
	}

	public void butonDizisineAt() {
		butonDizisi[0] = jButton1;
		butonDizisi[1] = jButton2;
		butonDizisi[2] = jButton3;
		butonDizisi[3] = jButton4;
		butonDizisi[4] = jButton5;
		butonDizisi[5] = jButton6;
		butonDizisi[6] = jButton7;
		butonDizisi[7] = jButton8;
		butonDizisi[8] = jButton9;
		butonDizisi[9] = jButton10;
		butonDizisi[10] = jButton11;
		butonDizisi[11] = jButton12;
		butonDizisi[12] = jButton13;
		butonDizisi[13] = jButton14;
		butonDizisi[14] = jButton15;
		butonDizisi[15] = jButton16;

	}

	public void butonDevreDisi() {
		jButton1.setEnabled(false);
		jButton2.setEnabled(false);
		jButton3.setEnabled(false);
		jButton4.setEnabled(false);
		jButton5.setEnabled(false);
		jButton6.setEnabled(false);
		jButton7.setEnabled(false);
		jButton8.setEnabled(false);
		jButton9.setEnabled(false);
		jButton10.setEnabled(false);
		jButton11.setEnabled(false);
		jButton12.setEnabled(false);
		jButton13.setEnabled(false);
		jButton14.setEnabled(false);
		jButton15.setEnabled(false);
		jButton16.setEnabled(false);
	}

	public void butonEtkin() {
		jButton1.setEnabled(true);
		jButton2.setEnabled(true);
		jButton3.setEnabled(true);
		jButton4.setEnabled(true);
		jButton5.setEnabled(true);
		jButton6.setEnabled(true);
		jButton7.setEnabled(true);
		jButton8.setEnabled(true);
		jButton9.setEnabled(true);
		jButton10.setEnabled(true);
		jButton11.setEnabled(true);
		jButton12.setEnabled(true);
		jButton13.setEnabled(true);
		jButton14.setEnabled(true);
		jButton15.setEnabled(true);
		jButton16.setEnabled(true);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
