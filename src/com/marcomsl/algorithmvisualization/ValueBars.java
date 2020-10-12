package com.marcomsl.algorithmvisualization;

import javax.swing.*;
import java.awt.*;

public class ValueBars extends JPanel {

    int array[];
    int size;


    public ValueBars(int[] array, int size){

        this.array = array;
        this.size = size;

    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = 0;
        g.setColor(Color.WHITE);

        for(int i = 0; i < array.length; i++){
            g.fillRect(x + 1, size - 35 - array[i], 10, array[i]);

            x += 10;
        }

        g.setColor(Color.WHITE);

        repaint();
    }

}
