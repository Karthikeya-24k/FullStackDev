import { useState } from "react";

function Random() {
    // const [random, setRandom] = useState(0);
    const [num, setNum] = useState("");
    const [message, setMessage] = useState("");

    const generateNumber = () => {
        const newRandom = Math.floor(Math.random() * 10);
        // setRandom(newRandom);

        if (num !== "" && Number(num) === newRandom) {
            setMessage(" Correct! You nailed it.");
        } else {
            setMessage("Wrong! It was " + newRandom);
        }
    };

    return (
        <div className="game-container">
            <div className="game-card">
                <h2>Number Guessing Game</h2>
                <p>Pick a number between 0 and 9</p>
                
                <input 
                    type="number" 
                    placeholder="Enter your guess" 
                    value={num} 
                    onChange={(e) => setNum(e.target.value)} 
                />
                
                <br />
                
                <button onClick={generateNumber}>Check Guess</button>
                
                <h1>{message}</h1>
            </div>
        </div>
    );
}

export default Random;