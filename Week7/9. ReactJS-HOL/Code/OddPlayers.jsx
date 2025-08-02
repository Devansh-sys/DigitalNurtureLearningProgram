
export default function OddPlayers({ players }) {
    const [first, , third, , fifth] = players;

    return (
        <div>
            <h1>Odd Players</h1>
            <li>First : {first.name}</li>
            <li>Third : {third.name}</li>
            <li>Fifth : {fifth.name}</li>
        </div>
    );
}

