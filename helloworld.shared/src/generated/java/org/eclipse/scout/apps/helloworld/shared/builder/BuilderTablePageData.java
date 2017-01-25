package org.eclipse.scout.apps.helloworld.shared.builder;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "org.eclipse.scout.apps.helloworld.client.builder.BuilderTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class BuilderTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public BuilderTableRowData addRow() {
		return (BuilderTableRowData) super.addRow();
	}

	@Override
	public BuilderTableRowData addRow(int rowState) {
		return (BuilderTableRowData) super.addRow(rowState);
	}

	@Override
	public BuilderTableRowData createRow() {
		return new BuilderTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return BuilderTableRowData.class;
	}

	@Override
	public BuilderTableRowData[] getRows() {
		return (BuilderTableRowData[]) super.getRows();
	}

	@Override
	public BuilderTableRowData rowAt(int index) {
		return (BuilderTableRowData) super.rowAt(index);
	}

	public void setRows(BuilderTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class BuilderTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
		public static final String name = "name";
		public static final String city = "city";
		private String m_name;
		private String m_city;

		public String getName() {
			return m_name;
		}

		public void setName(String newName) {
			m_name = newName;
		}

		public String getCity() {
			return m_city;
		}

		public void setCity(String newCity) {
			m_city = newCity;
		}
	}
}