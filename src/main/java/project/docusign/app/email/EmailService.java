package project.docusign.app.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private EmailRepository emailRepository;
	
	public Email addEmail(Email email) {
		return emailRepository.save(email);
	}
	
	public String getEmailLast() {
		List<Email> emails = (List<Email>) emailRepository.findAll();
		return emails.get(emails.size() - 1).getEmail();
	}
	
}
