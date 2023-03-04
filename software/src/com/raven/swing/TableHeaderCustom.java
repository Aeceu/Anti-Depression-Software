package com.raven.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.table.DefaultTableCellRenderer;

public class TableHeaderCustom extends DefaultTableCellRenderer {

    public TableHeaderCustom() {
        setPreferredSize(new Dimension(0, 35));
        setBackground(new Color(233,238,245)); //60, 60, 60
        setForeground(new Color(5,85,150)); // 200, 200, 200
        setFont(new Font("Segoe UI", Font.BOLD, 14));
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.setColor(new Color(100, 100, 100));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
}
