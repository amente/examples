/*******************************************************************************
 * Copyright (c) 1998, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *              dclarke - initial JPA Employee example using XML (bug 217884)
 *              mbraeuer - annotated version
 ******************************************************************************/
package model;

import javax.persistence.*;

/**
 * 
 * @author dclarke
 * @since EclipseLink 1.0
 */
@Entity
@Table(name = "PROJECT")
@DiscriminatorValue("S")
public class SmallProject extends Project {

	private SmallProject() {
		super();
	}

	public SmallProject(String name, String description) {
		this();
		setName(name);
		setDescription(description);
	}

}
