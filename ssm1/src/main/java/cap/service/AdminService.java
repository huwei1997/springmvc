package cap.service;

import cap.model.Admin;

import java.util.List;

import cap.util.PageBean;
public interface AdminService {
    Admin selectById(Integer id);

    List<Admin> selectAll();

    int addAdmin(Admin admin);

    int updateAdmin(Admin admin);

    int deleteAdmin(Integer id);

    PageBean findByPage(int pageNo, int pageSize);
}