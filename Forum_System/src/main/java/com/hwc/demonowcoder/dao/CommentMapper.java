package com.hwc.demonowcoder.dao;

import com.hwc.demonowcoder.entities.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CommentMapper {

    /**
     * 根据评论类型(帖子评论和回复评论)和评论Id--分页查询评论
     *
     * @return Comment类型集合
     */
    List<Comment> selectCommentsByEntity(@Param("entityType") int entityType, @Param("entityId") int entityId,
                                         @Param("offset") int offset, @Param("limit") int limit);

    int selectCountByEntity(@Param("entityType") int entityType, @Param("entityId") int entityId);

    int insertComment(Comment comment);

    Comment selectComment(@Param("id") int id);

    List<Comment> selectCommentsByUserId(@Param("userId") int userId, @Param("entityType") int entityType,
                                         @Param("offset") int offset, @Param("limit") int limit);

    int selectCountByUserId(@Param("userId") int userId, @Param("entityType") int entityType);
}
