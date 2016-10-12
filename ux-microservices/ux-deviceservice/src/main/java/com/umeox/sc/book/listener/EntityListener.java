package com.umeox.sc.book.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.umeox.sc.book.domain.BaseEntity;


/**
 * 实体监听器
 */
public class EntityListener {
	
	@PrePersist
	public void prePersist(BaseEntity entity) {
		if (entity.getCreateDate() == null) {
			entity.setCreateDate(new Date());
		}
		if (entity.getModifyDate() == null) {
			entity.setModifyDate(new Date());
		}
	}

	@PreUpdate
	public void preUpdate(BaseEntity entity) {
		entity.setModifyDate(new Date());
	}
}
