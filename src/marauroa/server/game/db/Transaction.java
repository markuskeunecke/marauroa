/* $Id: Transaction.java,v 1.4 2007/02/10 18:23:03 arianne_rpg Exp $ */
/***************************************************************************
 *                      (C) Copyright 2003 - Marauroa                      *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/

package marauroa.server.game.db;

import java.sql.SQLException;

/**
 * This class represents a transaction which can be used to retrieve/store/change in Database. 
 * <p>
 * Different Database implementaions may requiere different implementations of this class.
 */
public class Transaction {
	/** 
	 * Starts a transaction 
	 * @throws SQLException 
	 */
	public void begin() throws SQLException {
	}

	/**
	 * commits the changes made to backstore.
	 * 
	 * @exception TransactionException if the underlaying backstore throws an Exception
	 * @throws SQLException 
	 */
	public void commit() throws SQLException {
	}

	/** 
	 * Makes previous changes to backstore invalid 
	 */
	public void rollback() throws SQLException {
	}
}