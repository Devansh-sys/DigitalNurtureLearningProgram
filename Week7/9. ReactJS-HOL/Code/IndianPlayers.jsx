

const IndianPlayers = () => {
    const T20Players = ['First Player', 'Second Player', 'Third Player'];
    const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
    const indianPlayers = [...T20Players, ...RanjiTrophyPlayers];

    return (
        <div><h1>Indian Players </h1>
            <div>{indianPlayers.map((item) => {
                return <li>Mr. {item}</li>
            })}</div></div>
    )

}

export default IndianPlayers;