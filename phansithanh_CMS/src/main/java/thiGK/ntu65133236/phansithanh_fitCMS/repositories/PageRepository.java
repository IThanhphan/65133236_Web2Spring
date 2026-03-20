package thiGK.ntu65133236.phansithanh_fitCMS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiGK.ntu65133236.phansithanh_fitCMS.models.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer> {

}
