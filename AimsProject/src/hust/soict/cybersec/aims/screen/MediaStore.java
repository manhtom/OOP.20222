package hust.soict.cybersec.aims.screen;

import java.awt.*;

import javax.swing.*;

import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.disc.*;

public class MediaStore extends JPanel {
        private Media media;
        public MediaStore(Media media) {
            this.media = media;
            this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            JLabel title = new JLabel(media.getTitle());
            title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
            title.setAlignmentX(CENTER_ALIGNMENT);

            JLabel cost = new JLabel(""+media.getCost()+ "$");
            cost.setAlignmentX(CENTER_ALIGNMENT);

            JPanel container = new JPanel();
            container.setLayout(new FlowLayout(FlowLayout.CENTER));

            container.add(new JButton("Add to Cart"));
            if (media instanceof Playable) {
                container.add(new JButton("Play"));
            }
            this.add(Box.createVerticalGlue());
            this.add(title);
            this.add(cost);
            this.add(Box.createVerticalGlue());
            this.add(container);

            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }