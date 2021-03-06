//
//  @(#)EmptyControlBar.java		11/2003
//
//  Copyright 2003 Zachary DelProposto. All rights reserved.
//  Use is subject to license terms.
//
//
//  This program is free software; you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation; either version 2 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program; if not, write to the Free Software
//  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//  Or from http://www.gnu.org/
//
package dip.gui.map;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;

import dip.misc.Utils;

/**
*	Does nothing, except take up space.
*	
*/
public class EmptyControlBar extends ControlBar
{
	// same icon as used by 'best fit' in ViewControlBar 
	private static final String ICON_ZOOM_FIT	= "resource/common/icons/24x24/Refresh24.gif";
	
	/** Create an EmptyControlBar */
	public EmptyControlBar(MapPanel mp)
	{
		super(mp);
		
		// create a button to get the size
		// we do this to make sure the JButton characteristics 
		// are that of a toolbar button.
		JButton fit = add(new AbstractAction()
		{
			public void actionPerformed(ActionEvent evt)
			{
				// nothing here!
			}
 		});
		fit.setIcon(Utils.getIcon(ICON_ZOOM_FIT));
		
		Dimension size = fit.getPreferredSize();
		add(Box.createVerticalStrut(size.height));
		remove(fit);
	}// EmptyControlBar()
}// class EmptyControlBar	

