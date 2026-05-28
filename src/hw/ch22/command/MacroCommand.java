package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();

    // undo된 명령을 redo를 위해 임시 저장
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        // push()는 앞쪽에 추가되므로, 오래된 명령부터 실행해야 함
        Iterator<Command> it = commands.descendingIterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);

        // 새로운 명령이 추가되면 redo할 수 있는 명령은 삭제
        commandsForRedo.clear();
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    // undo된 명령 다시 복원
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
