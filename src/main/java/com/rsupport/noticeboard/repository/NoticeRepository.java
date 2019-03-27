package com.rsupport.noticeboard.repository;

import com.rsupport.noticeboard.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
