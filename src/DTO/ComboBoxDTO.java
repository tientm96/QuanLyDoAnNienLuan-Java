
package DTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComboBoxDTO {
    public Object Display;
    public Object Value;

    public ComboBoxDTO(Object display, Object value) {
        Display = display;
        Value = value;
    }

    @Override
    public String toString() {
        return Display.toString();
    }
    public static void LoadDuLieuCombobox(ResultSet rs, JComboBox Combobox, String TenCotHienThi, String TenCotMa) {
        DefaultComboBoxModel Combo = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                ComboBoxDTO item = new ComboBoxDTO(rs.getString(TenCotHienThi), rs.getString(TenCotMa));
                Combo.addElement(item);
                    Combobox.setModel(Combo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public static void setSelectedComboBox(JComboBox cbb,String cbbValue){
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                ComboBoxDTO m = (ComboBoxDTO) obj;
                if (cbbValue.equals(m.Display)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }
    
    public static String getSelectedItemID(JComboBox cbb) {
        String result;
        Object[] obj = cbb.getSelectedObjects();
        ComboBoxDTO item = (ComboBoxDTO) obj[0];
        result = item.Value.toString();
        return result;
    }       
}
