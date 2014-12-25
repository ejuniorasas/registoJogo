package br.com.emporiodaarte.bean;

public interface IGenericBean <T>{

	public T fromBean(IGenericBean bean);
	public void toBean(T entity);
}
