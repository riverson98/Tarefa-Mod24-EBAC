package com.rcosta.dao.mocks;

import com.rcosta.dao.ClienteDao;

/**
 * @author rodrigo.pires
 */
public class ClienteDaoMock implements ClienteDao {

    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Sucesso";
    }

    @Override
    public String excluir() {
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        return "Sucesso";
    }
}
