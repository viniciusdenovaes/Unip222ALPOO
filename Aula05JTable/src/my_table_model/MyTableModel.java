package my_table_model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import entidades.Pato;

public class MyTableModel implements TableModel {
	
	List<Pato> patos = new ArrayList<>();
	
	static final String[] colNames = new String[] {"id", "nome", "selecionado"};
	
	public void addPato(Pato pato) {
		patos.add(pato);
	}

	@Override
	public int getRowCount() {
		return patos.size();
	}

	@Override
	public int getColumnCount() {
		return colNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colNames[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if(columnIndex==2) return Boolean.class;
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if()
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

}
