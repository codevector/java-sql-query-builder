package com.github.danfickle.javasqlquerybuilder.generic;

import com.github.danfickle.javasqlquerybuilder.QbDelete;
import com.github.danfickle.javasqlquerybuilder.QbFactory;
import com.github.danfickle.javasqlquerybuilder.QbField;
import com.github.danfickle.javasqlquerybuilder.QbInsert;
import com.github.danfickle.javasqlquerybuilder.QbQuery;
import com.github.danfickle.javasqlquerybuilder.QbSelect;
import com.github.danfickle.javasqlquerybuilder.QbUpdate;

public class QbFactoryImp implements QbFactory {

	@Override
	public QbField newAllField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newAllField(String table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newStdField(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newQualifiedField(String table, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newSum(QbField field, String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newCount(QbField field, String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newAvg(QbField field, String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newMin(QbField field, String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newMax(QbField field, String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbField newCustomField(String custom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbSelect newSelectQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbUpdate newUpdateQuery() {
		return new QbUpdateImp();
	}

	@Override
	public QbDelete newDeleteQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QbInsert newInsertQuery()
	{
		return new QbInsertImp();
	}

	@Override
	public QbQuery newQuery(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}