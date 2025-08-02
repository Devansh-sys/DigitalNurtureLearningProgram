export default function EvenPlayers({ players }) {
    const [, second, , fourth, , sixth] = players;
    return (<div>
        <h1>Even Players</h1>
        <li>Second : {second.name}</li>
        <li>Fourth : {fourth.name}</li>
        <li>Sixth : {sixth.name}</li>
    </div>)
}

