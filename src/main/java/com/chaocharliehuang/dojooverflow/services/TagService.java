package com.chaocharliehuang.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chaocharliehuang.dojooverflow.models.Tag;
import com.chaocharliehuang.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	
	private TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public List<Tag> getAllTags() {
		return (List<Tag>) tagRepository.findAll();
	}
	
	public Tag findTagBySubject(String subject) {
		return tagRepository.findOneBySubjectIs(subject);
	}

}
