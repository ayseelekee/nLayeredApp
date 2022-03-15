package nLayeredApp.dataAccess.concretes;

import java.util.List;

import nLayeredApp.entities.concretes.CorporateCustomer;

public class HibernateCorporateCustomerDao implements CorporateCustomerDao {

	@Override
	public void add(CorporateCustomer corporateCustomer) {
		System.out.println(corporateCustomer.getCompanyName()+ ": Hibernate ile eklendi");
		
	}

	@Override
	public void update(CorporateCustomer corporateCustomer) {
		System.out.println(corporateCustomer.getCompanyName()+ ": Hibernate ile gŁncellendi");
		
	}

	@Override
	public void delete(CorporateCustomer corporateCustomer) {
		System.out.println(corporateCustomer.getCompanyName()+ ": Hibernate ile silindi");
		
	}

	@Override
	public List<CorporateCustomer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
