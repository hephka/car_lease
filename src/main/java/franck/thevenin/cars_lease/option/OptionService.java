package franck.thevenin.cars_lease.option;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
	@Autowired
	OptionRepository optionRepository;
	
	public Option save(Option option) {
		return optionRepository.save(option);
	}
	
	public List<Option> getAll() {
		return optionRepository.findAll();
	}
	
	public Option getById(long id) {
		return optionRepository.findById(id).orElse(null);
	}
	
	public boolean deleteById(long id) {
		try {
			optionRepository.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
