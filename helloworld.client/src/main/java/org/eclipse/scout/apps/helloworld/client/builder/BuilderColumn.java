package org.eclipse.scout.apps.helloworld.client.builder;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;

public class BuilderColumn extends AbstractStringColumn {
	
	public int index;
	
	public BuilderColumn(int index) {
		
		super();
		this.index = index;
	}
	
	@Override
	protected String getConfiguredHeaderText() {
		
		return "Builder";
	}
	
	@Override
	protected boolean getConfiguredEditable() {
		return true;
	}	
}
