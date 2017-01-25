package org.eclipse.scout.apps.helloworld.client.builder;

import org.eclipse.scout.rt.client.ui.basic.table.columns.IColumn;
import org.eclipse.scout.rt.client.ui.basic.table.customizer.AbstractTableCustomizer;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;

public class BuilderTableCustomizer extends AbstractTableCustomizer {
	
	public BuilderTableCustomizer() {
		super();
	}
	
	@Override
	public void injectCustomColumns(OrderedCollection<IColumn<?>> columnList) {
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!injectCol list.size");
		System.out.println(columnList.size());
		
		columnList.addLast(new BuilderColumn(1));
		columnList.addLast(new BuilderColumn(2));
		columnList.addLast(new BuilderColumn(4));		
	}

/*	@Override
	public void addColumn(IColumn<?> insertAfterColumn) {
	
		//List<IColumn<?>> columnList = new ArrayList<IColumn<?>>();
		
		ITable table = insertAfterColumn.getTable();
		table.column
		List<IColumn<?>> columns = table.getColumns();
		columns.
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!addCol getTable");
		System.out.println(columns);
		
	}*/
	
	@Override
	public String getPreferencesKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
