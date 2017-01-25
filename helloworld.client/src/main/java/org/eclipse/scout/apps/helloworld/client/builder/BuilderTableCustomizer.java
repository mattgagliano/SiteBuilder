package org.eclipse.scout.apps.helloworld.client.builder;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.IColumn;
import org.eclipse.scout.rt.client.ui.basic.table.customizer.AbstractTableCustomizer;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;

public class BuilderTableCustomizer extends AbstractTableCustomizer {
	
	public String names[] = new String[5];
	
	public BuilderTableCustomizer() {
		super();
		names[0] = "name0";
		names[1] = "name1";
		names[2] = "name2";
		names[3] = "name3";
		names[4] = "name4";
	}
	
	@Override
	public void injectCustomColumns(OrderedCollection<IColumn<?>> columnList) {
		
		columnList.addLast(new BuilderColumn(1));
		columnList.addLast(new BuilderColumn(2));
		columnList.addLast(new BuilderColumn(4));
	}

	@Override
	public void addColumn(IColumn<?> insertAfterColumn) {
	
		
	}
	
	@Override
	public String getPreferencesKey() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class BuilderColumn extends AbstractStringColumn {
		
		public int index;
		
		public BuilderColumn(int index) {
			
			super();
			this.index = index;
		}
		
		@Override
		protected String getConfiguredHeaderText() {

			System.out.println(getClass());
			
			return names[index];
		}
		
		@Override
		protected boolean getConfiguredEditable() {
			return true;
		}
	
		
	}

}
