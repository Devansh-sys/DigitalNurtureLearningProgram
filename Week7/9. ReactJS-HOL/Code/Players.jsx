


const Players = () => {
    const players = [
        { name: "Virat Kohli", score: 85 },
        { name: "Rohit Sharma", score: 73 },
        { name: "KL Rahul", score: 49 },
        { name: "Suryakumar Yadav", score: 61 },
        { name: "Shubman Gill", score: 38 },
        { name: "Shreyas Iyer", score: 56 },
        { name: "Hardik Pandya", score: 41 },
        { name: "Ravindra Jadeja", score: 33 },
        { name: "Jasprit Bumrah", score: 8 },
        { name: "Mohammed Shami", score: 12 },
        { name: "Kuldeep Yadav", score: 17 }
    ];

    return (
        <>
            <h1>List of Players</h1>
            <ul>
                {players.map((item, index) => (
                    <li key={index}>
                        Mr. {item.name} <span>{item.score}</span>
                    </li>
                ))}
            </ul>
        </>
    );


}
export default Players;