package com.raven.swing;

import com.raven.swing.scroll.ScrollBarCustom;
import com.raven.table.TableCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;

public class Table extends TableCustom {

    public Table() {
    }

    public void addTableStyle(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(233,238,245)); //240, 60, 60
        setForeground(new Color(35,117,145)); // 214, 214, 214
        setSelectionForeground(new Color(214, 214, 214));
        setSelectionBackground(new Color(213,218,215)); // 50, 50, 50
        getTableHeader().setDefaultRenderer(new TableHeaderCustom());
        setRowHeight(47);
        setShowHorizontalLines(true);
        setGridColor(new Color(5,85,150)); //50, 50, 50
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        setFont(new Font("Segoe UI", Font.BOLD, 14));
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        Component com = super.prepareRenderer(tcr, i, i1);
        if (!isCellSelected(i, i1)) {
            com.setBackground(new Color(233,238,245 )); // 60, 60,60
        }
        return com;
    }

}
