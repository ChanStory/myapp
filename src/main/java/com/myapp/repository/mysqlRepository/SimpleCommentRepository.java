package com.myapp.repository.mysqlRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.mysqlObject.SimpleComment;

public interface SimpleCommentRepository extends JpaRepository<SimpleComment, Long>
{

}