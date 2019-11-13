package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

@SuppressWarnings("WeakerAccess")
public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        criaAlunosDeTeste();
    }

//    private void criaAlunosDeTeste() {
//        AlunoDAO dao = new AlunoDAO();
//        dao.salva(new Aluno("Bruno", " 011-96415-0140", "teste@bruno.com"));
//        dao.salva(new Aluno("Samara", " 011-96415-0150", "teste@samara.com"));
//    }
}
