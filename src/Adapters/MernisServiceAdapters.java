package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap mernis = new KPSPublicSoapProxy();

        try {
            return mernis.TCKimlikNoDogrula(Long.parseLong(customer.nationaltyId), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
        } catch (Exception e) {
        }

        return false;
	}
	

}
