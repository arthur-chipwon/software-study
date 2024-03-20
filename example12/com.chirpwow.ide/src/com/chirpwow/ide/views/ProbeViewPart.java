package com.chirpwow.ide.views;

import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label; 
import org.eclipse.swt.SWT;

public class ProbeViewPart extends ViewPart {

	public ProbeViewPart() {
	}

	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, SWT.WRAP);
		label.setText("[CW Probe]");
	}

	public void setFocus() {
		// set focus to my widget.  For a label, this doesn't
		// make much sense, but for more complex sets of widgets
		// you would decide which one gets the focus.
	}
}
