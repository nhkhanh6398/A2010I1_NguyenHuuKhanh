package service;

import bean.TComplex;
import responsitory.module.ModuleResponsitory;
import responsitory.module.ModuleResponsitoryImpl;

import java.util.List;

public class ModuleServiceImpl implements ModuleService {
    private ModuleResponsitory moduleResponsitory = new ModuleResponsitoryImpl();
    @Override
    public List<TComplex> showList() {
        return this.moduleResponsitory.showList();
    }

    @Override
    public boolean save(TComplex tComplex) {
        return this.moduleResponsitory.save(tComplex);
    }

    @Override
    public boolean update(int id, TComplex tComplexcomplex) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return this.moduleResponsitory.delete(id);
    }

    @Override
    public List<TComplex> seacrhCustomer(String typeRoom) {
        return null;
    }
}
