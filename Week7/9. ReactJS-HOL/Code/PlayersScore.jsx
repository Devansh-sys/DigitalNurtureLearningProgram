
const PlayersScore = () => {
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
        <div> <h1>Players Score</h1>
            <ul>
                {players
                    .filter(item => item.score > 70)
                    .map(item => (
                        <li key={item.name}>{item.name} : {item.score}</li>
                    ))
                }
            </ul></div>
    );
}

export default PlayersScore;