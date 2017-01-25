package org.eclipse.scout.apps.helloworld.client.builder;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.IColumn;
import org.eclipse.scout.rt.client.ui.basic.table.customizer.AbstractTableCustomizer;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;

public class aBuilderTableCustomizer extends AbstractTableCustomizer {
	
	OrderedCollection<IColumn<?>> tcColumnList;
	
	public aBuilderTableCustomizer() {
		super();
		tcColumnList = new OrderedCollection<IColumn<?>>();		
	}
	
	@Override
	public void injectCustomColumns(OrderedCollection<IColumn<?>> columnList) {
				
		columnList.addLast(createDynamicColumn("dynamo"));		
		
		this.tcColumnList = columnList;
	}
	
	private IColumn<?> createDynamicColumn(final String label) {
		return new AbstractStringColumn() {
			@Override
			protected String getConfiguredHeaderText() {
				return label;
			}
			
			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		};
	}

	@Override
	public void addColumn(IColumn<?> insertAfterColumn) {
		
		super.addColumn(insertAfterColumn);
		System.out.println("super addcolumn!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//List<IColumn<?>> columnList = new ArrayList<IColumn<?>>();
		
	//	Table table = getTable();
		//table.setTableCustomizer(this);
		/*System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!addcolumn.tcColumnList vs passed table!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(tcColumnList.getOrderedList().toString());
		System.out.println(table.getColumns().toString());
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!now adding column first tcCol then passed!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		tcColumnList.addLast(new BuilderColumn(6));
		System.out.println(tcColumnList.getOrderedList().toString());
		/*List<IColumn<?>> columns = table.getColumns();
		columns.
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!addCol getTable");
		System.out.println(columns);*/
		
	}

	@Override
	public String getPreferencesKey() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
