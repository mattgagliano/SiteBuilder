package org.eclipse.scout.apps.helloworld.client;

import java.util.List;

import org.eclipse.scout.apps.helloworld.client.forms.FormsOutline;
import org.eclipse.scout.apps.helloworld.client.questions.QuestionsOutline;
import org.eclipse.scout.apps.helloworld.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.AbstractDesktop;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutlineViewButton;
import org.eclipse.scout.rt.client.ui.desktop.outline.IOutline;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;

/**
 * <h3>{@link Desktop}</h3>
 *
 * @author Matt.Gagliano
 */
public class Desktop extends AbstractDesktop {
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("SiteBuilderApp");
	}

	@Override
	protected String getConfiguredLogoId() {
		return Icons.AppLogo;
	}

	@Override
	protected List<Class<? extends IOutline>> getConfiguredOutlines() {
		return CollectionUtility.<Class<? extends IOutline>>arrayList(QuestionsOutline.class, FormsOutline.class);
	}

	@Override
	protected void execGuiAttached() {
		super.execGuiAttached();
		selectFirstVisibleOutline();
	}

	protected void selectFirstVisibleOutline() {
		for (IOutline outline : getAvailableOutlines()) {
			if (outline.isEnabled() && outline.isVisible()) {
				setOutline(outline);
				break;
			}
		}
	}
	
	public class QuestionsOutlineViewButton extends AbstractOutlineViewButton {
		
		public QuestionsOutlineViewButton() {
			this(QuestionsOutline.class);
		}
		
		public QuestionsOutlineViewButton(Class<? extends QuestionsOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}
	}
	
	public class FormsOutlineViewButton extends AbstractOutlineViewButton {
		
		public FormsOutlineViewButton() {
			this(FormsOutline.class);
		}
		
		public FormsOutlineViewButton(Class<? extends FormsOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}
	}
}
