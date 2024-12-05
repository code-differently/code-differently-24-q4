import React, {useState} from 'react';
import {useNavigate} from 'react-router-dom';

// Define the type for the form data
interface ProgramFormData {
  title: string;
  description: string;
}

const AddProgram: React.FC<{
  onAddProgram: (program: ProgramFormData) => void;
}> = ({onAddProgram}) => {
  const [formData, setFormData] = useState<ProgramFormData>({
    title: '',
    description: '',
  });
  const navigate = useNavigate();

  // Handle form field changes
  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const {name, value} = e.target;
    setFormData(prevData => ({
      ...prevData,
      [name]: value,
    }));
  };

  // Handle form submission
  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    onAddProgram(formData); // Add the new program
    navigate('/'); // Redirect back to the Program List page
  };

  return (
    <div className="add-program">
      <h1>Add New Program</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Title</label>
          <input
            type="text"
            name="title"
            value={formData.title}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Description</label>
          <input
            type="text"
            name="description"
            value={formData.description}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default AddProgram;
