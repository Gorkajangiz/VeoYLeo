package main;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FVeoYLeo extends JFrame {

    int anchoboton = 45;
    int altoboton = 45;
    Image imgadd = new ImageIcon("src/img/add.png").getImage();
    Image newimgadd = imgadd.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgaddicon = new ImageIcon(newimgadd);

    Image imgdelete = new ImageIcon("src/img/delete.png").getImage();
    Image newimgdelete = imgdelete.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgdeleteicon = new ImageIcon(newimgdelete);

    Image imgsave = new ImageIcon("src/img/save.png").getImage();
    Image newimgsave = imgsave.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgsaveicon = new ImageIcon(newimgsave);

    Image imgPrevious = new ImageIcon("src/img/previous.png").getImage();
    Image newimgPrevious = imgPrevious.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgPreviousicon = new ImageIcon(newimgPrevious);

    Image imgNext = new ImageIcon("src/img/next.png").getImage();
    Image newimgNext = imgNext.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgNexticon = new ImageIcon(newimgNext);

    Image imgPrint = new ImageIcon("src/img/print.png").getImage();
    Image newimgPrint = imgPrint.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgPrinticon = new ImageIcon(newimgPrint);

    Image imgExit = new ImageIcon("src/img/exit.png").getImage();
    Image newimgExit = imgExit.getScaledInstance(anchoboton, altoboton, Image.SCALE_DEFAULT);
    ImageIcon imgExiticon = new ImageIcon(newimgExit);

    JDateChooser dateChooser = new JDateChooser();

    JButton bnuevo = new JButton(imgaddicon);
    JButton bborrar = new JButton(imgdeleteicon);
    JButton bguardar = new JButton(imgsaveicon);
    JButton banterior = new JButton(imgPreviousicon);
    JButton bsiguiente = new JButton(imgNexticon);
    JButton bimprimir = new JButton(imgPrinticon);
    JButton bsalir = new JButton(imgExiticon);
    JComboBox cmbTipo = new JComboBox();
    JCheckBox cbFav = new JCheckBox();
    JLabel lFav = new JLabel();
    JLabel titulo = new JLabel();
    JLabel tipo = new JLabel();
    JLabel autor = new JLabel();
    JLabel valoracion = new JLabel();
    JLabel lVisto = new JLabel();
    JTextField tfVisto = new JTextField();
    JLabel etiquetas = new JLabel();
    JLabel comentario = new JLabel();
    JLabel foto = new JLabel();
    JTextField tfTitulo = new JTextField();
    JTextField tfTipo = new JTextField();
    JTextField tfAutor = new JTextField();
    JTextField tfValoracion = new JTextField();
    JTextField tfEtiquetas = new JTextField();
    JTextArea tfComentario = new JTextArea(3, 30);
    JTextArea taFoto = new JTextArea();
    JButton btFoto = new JButton();
    JPanel searchPanel = new JPanel();
    FotoPanel fotoPanel = new FotoPanel();
    JToolBar tbprincipal = new JToolBar();
    JPanel pbuscar = new JPanel();
    JButton[] bbuscar = new JButton[26];
    JFileChooser fc = new JFileChooser();

    private void sizeButton(JButton btn, Dimension dm){
        btn.setPreferredSize(dm);
        btn.setMinimumSize(dm);
        btn.setMaximumSize(dm);
    }

    public FVeoYLeo() {
        setTitle("Veo Y Leo");
        getContentPane().setLayout(new GridBagLayout());
        setResizable(true);
        GridBagConstraints gridConstraints;

        tbprincipal.setFloatable(false);
        tbprincipal.setBackground(Color.GRAY);
        tbprincipal.setOrientation(SwingConstants.VERTICAL);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridheight = 8;
        gridConstraints.fill = GridBagConstraints.VERTICAL;
        getContentPane().add(tbprincipal, gridConstraints);
        Dimension bSize = new Dimension(70, 70);

        bnuevo.setText("Nuevo");
        bnuevo.setToolTipText("Añado un nuevo elemento");
        bnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bnuevo.setFocusable(false);
        sizeButton(bnuevo, bSize);
        tbprincipal.add(bnuevo);
        bnuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                bnuevoActionPerformed(e);
            }
        });
        bborrar.setText("Borrar");
        bborrar.setToolTipText("Elimino un elemento");
        bborrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bborrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bborrar.setFocusable(false);
        sizeButton(bborrar, bSize);
        tbprincipal.add(bborrar);
        bborrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                bborrarActionPerformed(e);
            }
        });
        bguardar.setText("Guardar");
        bguardar.setToolTipText("Guardar el progreso");
        bguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bguardar.setFocusable(false);
        sizeButton(bguardar, bSize);
        tbprincipal.add(bguardar);
        bguardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                bguardarActionPerformed(e);
            }
        });

        banterior.setText("Anterior");
        banterior.setToolTipText("Ir a la página anterior");
        banterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        banterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        banterior.setFocusable(false);
        sizeButton(banterior, bSize);
        tbprincipal.add(banterior);
        banterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                banteriorActionPerformed(e);
            }
        });

        bsiguiente.setText("Siguiente");
        bsiguiente.setToolTipText("Ir a la página siguiente");
        bsiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bsiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bsiguiente.setFocusable(false);
        sizeButton(bsiguiente, bSize);
        tbprincipal.add(bsiguiente);
        bsiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                bsiguienteActionPerformed(e);
            }
        });

        bimprimir.setText("Imprimir");
        bimprimir.setToolTipText("Imprimir tu lista");
        bimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bimprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bimprimir.setFocusable(false);
        sizeButton(bimprimir, bSize);
        tbprincipal.add(bimprimir);
        bimprimir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                bimprimirActionPerformed(e);
            }
        });

        bsalir.setText("Salir");
        bsalir.setToolTipText("Salir de la aplicación");
        bsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bsalir.setFocusable(false);
        sizeButton(bsalir, bSize);
        tbprincipal.add(bsalir);
        bsalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bsalirActionPerformed(e);
            }
        });

        titulo.setText("Título:");
        titulo.setFont(new Font("Arial", Font.PLAIN, 14));
        titulo.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(titulo, gridConstraints);

        tfTitulo.setPreferredSize(new Dimension(450, 25));
        tfTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 4;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tfTitulo, gridConstraints);

        tipo.setText("Tipo:");
        tipo.setFont(new Font("Arial", Font.PLAIN, 14));
        tipo.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tipo, gridConstraints);

        cmbTipo.setPreferredSize(new Dimension(250, 25));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(cmbTipo, gridConstraints);

        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(cbFav, gridConstraints);

        lFav.setText("Fav ♥");
        lFav.setFont(new Font("Arial", Font.PLAIN, 14));
        lFav.setHorizontalAlignment(SwingConstants.LEFT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 1;
        gridConstraints.insets = new Insets(5, -50, 5, 5);
        getContentPane().add(lFav, gridConstraints);

        cmbTipo.addItem("Op1");
        cmbTipo.addItem("Op2");
        cmbTipo.addItem("Op3");

        autor.setText("Autor:");
        autor.setFont(new Font("Arial", Font.PLAIN, 14));
        autor.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(autor, gridConstraints);

        tfAutor.setPreferredSize(new Dimension(250, 25));
        tfAutor.setFont(new Font("Arial", Font.PLAIN, 16));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.gridwidth = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tfAutor, gridConstraints);

        valoracion.setText("Valoración:");
        valoracion.setFont(new Font("Arial", Font.PLAIN, 14));
        valoracion.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(valoracion, gridConstraints);

        tfValoracion.setPreferredSize(new Dimension(150, 25));
        tfValoracion.setFont(new Font("Arial", Font.PLAIN, 16));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tfValoracion, gridConstraints);

        lVisto.setText("Visto / Leído");
        lVisto.setFont(new Font("Arial", Font.PLAIN, 14));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(lVisto, gridConstraints);

        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 3;
        dateChooser.setPreferredSize(new Dimension(150, 25));
        dateChooser.setFont(new Font("Arial", Font.PLAIN, 16));
        getContentPane().add(dateChooser, gridConstraints);

        etiquetas.setText("Etiquetas:");
        etiquetas.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetas.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(etiquetas, gridConstraints);

        tfEtiquetas.setPreferredSize(new Dimension(450, 25));
        tfEtiquetas.setFont(new Font("Arial", Font.PLAIN, 16));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 4;
        gridConstraints.gridwidth = 4;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tfEtiquetas, gridConstraints);

        comentario.setText("Comentario:");
        comentario.setFont(new Font("Arial", Font.PLAIN, 14));
        comentario.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 5;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(comentario, gridConstraints);

        tfComentario.setFont(new Font("Arial", Font.PLAIN, 16));
        tfComentario.setLineWrap(true);
        tfComentario.setWrapStyleWord(true);
        tfComentario.setPreferredSize(new Dimension(450, 60));
        tfComentario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 5;
        gridConstraints.gridwidth = 4;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(tfComentario, gridConstraints);
        tfComentario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (tfComentario.getText().length() >= 170) {
                    e.consume();
                }
            }
        });

        foto.setText("Foto:");
        foto.setFont(new Font("Arial", Font.PLAIN, 14));
        foto.setHorizontalAlignment(SwingConstants.RIGHT);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 6;
        gridConstraints.anchor = GridBagConstraints.EAST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(foto, gridConstraints);

        taFoto.setPreferredSize(new Dimension(350, 40));
        taFoto.setFont(new Font("Arial", Font.PLAIN, 16));
        taFoto.setBackground(Color.decode("#FFFFC1"));
        taFoto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 6;
        gridConstraints.gridwidth = 3;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(taFoto, gridConstraints);

        gridConstraints = new GridBagConstraints();
        btFoto.setText("...");
        btFoto.setPreferredSize(new Dimension(40, 25));
        gridConstraints.gridx = 5;
        gridConstraints.gridy = 6;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(btFoto, gridConstraints);
        btFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                btFotoActionPerformed(e);
            }
        });

        //Panel busqueda letras
        pbuscar.setPreferredSize(new Dimension(250, 170));
        TitledBorder border = BorderFactory.createTitledBorder("Búsqueda de Títulos");
        border.setTitleFont(new Font("Arial", Font.PLAIN, 16));
        pbuscar.setBorder(border);
        pbuscar.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 7;
        gridConstraints.gridwidth = 3;
        gridConstraints.insets = new Insets(10, 0, 10, 0);
        gridConstraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add(pbuscar, gridConstraints);
        int x = 0, y = 0;
        for (int i = 0; i < 26; i++) {
            bbuscar[i] = new JButton();
            bbuscar[i].setText(String.valueOf((char) (65 + i)));
            bbuscar[i].setFont(new Font("Arial", Font.BOLD, 15));
            bbuscar[i].setMargin(new Insets(-10, -10, -10, -10));
            sizeButton(bbuscar[i], new Dimension(37, 27));
            bbuscar[i].setBackground(Color.WHITE);
            bbuscar[i].setFocusable(false);
            gridConstraints = new GridBagConstraints();
            gridConstraints.gridx = x;
            gridConstraints.gridy = y;
            pbuscar.add(bbuscar[i], gridConstraints);
            bbuscar[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
//                    searchButtonActionPerformed(e);
                }
            });
            x++;
            if (x % 6 == 0) {
                x = 0;
                y++;
            }
        }

        //Panel foto libro
        fotoPanel.setPreferredSize(new Dimension(240, 160));
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 7;
        gridConstraints.gridwidth = 3;
        gridConstraints.insets = new Insets(10, 0, 10, 10);
        gridConstraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add(fotoPanel, gridConstraints);

        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), (int) getWidth(), (int) getHeight());
    }

    public void bnuevoActionPerformed(ActionEvent e) {

    }

    public void bborrarActionPerformed(ActionEvent e) {

    }

    public void bguardarActionPerformed(ActionEvent e) {

    }

    public void banteriorActionPerformed(ActionEvent e) {

    }

    public void bsiguienteActionPerformed(ActionEvent e) {

    }

    public void bimprimirActionPerformed(ActionEvent e) {

    }

    public void btFotoActionPerformed(ActionEvent e) {
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setDialogTitle("Abre el archivo de Foto");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de imágenes", "jpg", "jpeg", "png"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
            mostrarFotoEnTf(fc.getSelectedFile().toString());
    }

    private void mostrarFotoEnTf(String fotoFile) {
        if (!fotoFile.equals("")) {
            try {
                taFoto.setText(fotoFile);
            } catch (Exception ex) {
                taFoto.setText("");
            }
        } else {
            taFoto.setText("");
        }
        fotoPanel.setRuta(taFoto.getText());
        fotoPanel.paintComponent(fotoPanel.getGraphics());
    }

    public void bsalirActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}