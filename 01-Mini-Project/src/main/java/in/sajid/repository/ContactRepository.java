package in.sajid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sajid.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
