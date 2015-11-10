package com.pks.insurance.jpa.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy;

public class PkNamingStrategy extends SpringNamingStrategy {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8879609057247521203L;

	@Value("app.db.tbl-prefix")
	private static String TBL_PREFIX;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.cfg.ImprovedNamingStrategy#tableName(java.lang.String)
	 */
	@Override
	public String tableName(String tableName) {
		// TODO Auto-generated method stub
		return TBL_PREFIX + super.tableName(tableName);
	}

	@Override
	public String classToTableName(final String className) {
		return this.addPrefix(super.classToTableName(className));
	}

	@Override
	public String collectionTableName(final String ownerEntity, final String ownerEntityTable,
			final String associatedEntity, final String associatedEntityTable, final String propertyName) {
		return this.addPrefix(super.collectionTableName(ownerEntity, ownerEntityTable, associatedEntity,
				associatedEntityTable, propertyName));
	}

	@Override
	public String logicalCollectionTableName(final String tableName, final String ownerEntityTable,
			final String associatedEntityTable, final String propertyName) {
		return this.addPrefix(
				super.logicalCollectionTableName(tableName, ownerEntityTable, associatedEntityTable, propertyName));
	}

	private String addPrefix(final String composedTableName) {

		return TBL_PREFIX + composedTableName.toUpperCase().replace("_", "");

	}

}
