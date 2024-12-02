import React, { useState } from "react";


const AddProgramPage: React.FC = () => {
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");

    const handleSubmit = async (e: { preventDefault: () => void; }) => {
        e.preventDefault();
        try {
            await fetch("http://localhost:5173/programs", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ title, description }),
            });
            alert("Program added!");
        } catch (error) {
            console.error("Error adding program:", error);
        }
        };

        return (
            <form onSubmit={handleSubmit}>
                <label>
                    <input
                    type="text"
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                    />
                </label>
                <label>
                    Description:
                    <textarea
                    value={description}
                    onChange={(e) => setDescription(e.target.value)}
                    />
                </label>
                <button type="submit">Add Proggram</button>
            </form>
        );
    };
export default AddProgramPage;