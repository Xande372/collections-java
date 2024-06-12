package Map.OrdenacaoEmMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        // eventosMap.put(data, evento);

        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        //usado treemap pq ele já organiza automaticamente.
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();

        LocalDate dataAtualSistema = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtualSistema) || entry.getKey().isAfter(dataAtualSistema)) {
                System.out.println("O próximo evento é: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }
}
