package hust.soict.cybersec.aims.screen;

import java.awt.*;
import javax.swing.*;

import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.disc.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MediaStore extends JPanel {
    private Media media;
    private Cart cart;

    public MediaStore(Media media) {
        this.cart = new Cart();
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+ "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        ButtonListener btnListener = new ButtonListener();
        JButton addToCart = new JButton("Add to Cart");
        container.add(addToCart);
        addToCart.addActionListener(btnListener);

        if (media instanceof Playable) {
            JButton play = new JButton("Play");
            container.add(play);
            play.addActionListener(btnListener);
        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add to Cart")) {
                boolean add = cart.addMedia(media);
                if (add) {
                    JOptionPane.showMessageDialog(null, String.format("Added %s to cart", media.getTitle()), "AIMS", 3);
                }
                else {
                    JOptionPane.showMessageDialog(null, String.format("Unable to add %s to cart", media.getTitle()), "AIMS", 3);
                }
            }

            else if (button.equals("Play")) {
                ((Playable)media).play();
                JLabel a = new JLabel(String.format("Playing %s", media.getTitle()), JLabel.CENTER);
                JOptionPane o = new JOptionPane(a);
                JDialog dialog = o.createDialog("AIMS");
                dialog.setVisible(true);
            }
        }
    }
}
