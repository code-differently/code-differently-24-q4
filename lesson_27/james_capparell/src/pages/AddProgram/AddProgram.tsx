import './AddProgram.scss';
import React from 'react';


export const AddProgram: React.FC = () => {
    return (
        <div className="add-program">
            <h1>Add New Program</h1>
            <form >
                <div>
                    <label>Title</label>
                    <input
                        type="text"
                        name="title"
                        // value={formData.title}
                        // onChange={handleChange}
                        required
                    />
                </div>
        <div>
          <label>Description</label>
          <input
            type="text"
            name="description"
            // value={formData.description}
            // onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
    );
};

export default AddProgram