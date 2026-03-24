package thiGK.ntu65133236.fit_ntu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu65133236.fit_ntu.model.Post;
import thiGK.ntu65133236.fit_ntu.repository.PostRepository;

@Service
public class PostService {

	private final PostRepository repo;

	public PostService(PostRepository repo) {
		this.repo = repo;
	}

	public List<Post> findAll() {
		return repo.findAll();
	}

	public Post findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void save(Post post) {
		repo.save(post);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}