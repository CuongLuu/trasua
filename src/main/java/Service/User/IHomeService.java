package Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.sanpham;

@Service
public interface IHomeService {
	@Autowired
	public List<sanpham> GetDataSlide();
}
