package org.mld.mapper;

import org.mld.po.Appmenu;

import java.util.List;

public interface AppmenuMapperSelf {
    List<Appmenu> findMenuByRole(Integer roleid);
}
