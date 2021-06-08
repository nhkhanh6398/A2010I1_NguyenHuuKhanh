package responsitory.module;

import bean.TComplex;

import java.util.List;

public interface ModuleResponsitory {
    List<TComplex> showList();
    boolean save (TComplex tComplex);
    boolean update (int id, TComplex tComplexcomplex);
    boolean delete(String id);
    List<TComplex> seacrhCustomer(String typeRoom);
}
