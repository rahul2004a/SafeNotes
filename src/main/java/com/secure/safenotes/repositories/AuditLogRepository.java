package com.secure.safenotes.repositories;

import com.secure.safenotes.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
