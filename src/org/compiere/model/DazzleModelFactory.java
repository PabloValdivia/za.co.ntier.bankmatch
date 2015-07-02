package org.compiere.model;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

/**
 * @author ngordon
 * Date: 15 Sep 2014
 */
public class DazzleModelFactory implements IModelFactory {

	/** Logger */
	private static CLogger log = CLogger.getCLogger(DazzleModelFactory.class);

	@Override
	public Class<?> getClass(String tableName) {
	
		//#1
		if ( MMatchSetup.Table_Name.equals(tableName))
			return MMatchSetup.class;
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		
		//#1
		if ( MMatchSetup.Table_Name.equals(tableName))
			return new MMatchSetup(Env.getCtx(), Record_ID, trxName);
		
		return null;
		
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		
		//#1
		if ( MMatchSetup.Table_Name.equals(tableName))
			return new MMatchSetup(Env.getCtx(), rs, trxName);
		
		return null;
	}

}
